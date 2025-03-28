在 Java 中，**父类的 `private` 成员会被子类继承，但子类无法直接访问它们**。具体行为如下：

---

### 1. **继承机制与访问权限**
- **继承的本质**：子类会继承父类的所有成员（包括 `private` 字段和方法），但这些成员的**可见性**由访问修饰符决定。
- **`private` 的限制**：  
  `private` 成员仅在定义它们的类内部可见，子类无法直接通过名称访问父类的 `private` 成员（无论是字段还是方法）。

---

### 2. **示例验证**
```java
class Parent {
    private int privateField = 10; // 父类私有字段
    
    private void privateMethod() { // 父类私有方法
        System.out.println("Parent's private method");
    }
}

class Child extends Parent {
    public void testAccess() {
        // System.out.println(privateField);   // 编译错误：无法直接访问父类私有字段
        // privateMethod();                   // 编译错误：无法直接调用父类私有方法
    }
}
```
- **结论**：子类无法直接访问父类的 `private` 成员。

---

### 3. **如何间接访问父类的 `private` 成员？
父类可以通过 **非 `private` 的方法（如 `public/protected`）** 暴露对 `private` 成员的操作，子类通过调用这些方法间接访问：
```java
class Parent {
    private int privateField = 10;
    
    // 提供 public 方法间接访问 private 字段
    public int getPrivateField() {
        return privateField;
    }
}

class Child extends Parent {
    public void printField() {
        System.out.println(getPrivateField()); // 通过父类 public 方法获取值
    }
}
```

---

### 4. **为什么说 `private` 成员被继承？
虽然子类不能直接访问 `private` 成员，但它们**物理上存在于子类对象的内存中**。可以通过以下方式验证：
- **反射**：强行访问父类 `private` 字段（需关闭安全检查）：
  ```java
  import java.lang.reflect.Field;

  public class ReflectionTest {
      public static void main(String[] args) throws Exception {
          Child child = new Child();
          Field field = Parent.class.getDeclaredField("privateField");
          field.setAccessible(true); // 关闭访问检查
          System.out.println(field.get(child)); // 输出：10
      }
  }
  ```

---

### 5. **关键总结**
| 场景                  | 结果                                                                 |
|-----------------------|----------------------------------------------------------------------|
| 子类直接访问 `private` 成员  | **编译错误**（不可见）                                               |
| 通过父类非 `private` 方法访问 | **允许**（如 `public/protected` 的 getter/setter）                   |
| 通过反射访问           | **允许**（但需主动关闭安全检查，不推荐常规使用）                     |

---

### 6. **设计意义**
- **封装性**：`private` 修饰符强制子类通过父类提供的方法操作数据，避免直接修改内部状态，确保数据安全性。
- **代码维护**：父类可以自由修改 `private` 成员的实现，而无需担心影响子类。

---

如果你需要子类直接访问父类的成员，应使用 `protected` 或默认（包级私有）修饰符，而非 `private`。
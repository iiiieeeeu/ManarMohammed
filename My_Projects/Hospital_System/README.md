# 🏥 Hospital Management System
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Architecture](https://img.shields.io/badge/Architecture-MVC-red?style=for-the-badge) ![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
## ✨ المميزات (Features)

1. إدارة المرضى (Patient Management):
* إضافة مرضى جدد للنظام مع توليد أرقام تعريفية (IDs) فريدة تلقائياً لتجنب التكرار.
* نظام خروج المرضى (Discharge)، ونقلهم من قائمة "المرضى النشطين" إلى "سجل المغادرين".
* نظام حماية متقدم من أخطاء الذاكرة (NullPointerException).
2. إدارة الخدمات والفواتير (Services & Billing):
* عرض ديناميكي لقائمة الخدمات الطبية المتاحة وأسعارها.
* حساب الفاتورة الإجمالية (Total Cost) للمريض برمجياً بناءً على الخدمات المضافة.

3. نظام البحث المتقدم (Advanced Search):
* البحث عن مريض بواسطة الـ ID الخاص به.
* عرض تقرير شامل يشمل (اسم المريض، رقمه، قائمة مفصلة بخدماته، والمجموع الكلي).

4. لوحة تحكم المستشفى (Hospital Dashboard):
* عرض إحصائيات حية لعدد المرضى الحاليين والمغادرين.
* حساب إجمالي أرباح المستشفى.

## 🚀 التقنيات والاساليب البرمجية

* Object-Oriented Programming (OOP): Full reliance on OOP concepts to build real-world models (Patient, Service).
* Clean Architecture (MVC Pattern): Applying the Separation of Concerns principle by dividing the project into 3 logical layers:
  - Models: To represent and structure data (Patients and Services).
  - Controllers: To handle business logic and operations (List management and searching).
  - MainApp: The entry point for execution and command routing.
* Defensive Programming: Protecting the system from crashing using techniques such as:
  - Early Exit: To reduce the complexity of nested if-statements and enhance code readability.
  - Null Checks: Proactive data validation to prevent the famous NullPointerException.
* Encapsulation: Securely wrapping class data (like IDs and prices) by making them private and controlling them exclusively through Getters/Setters.
* Dynamic Data Handling: Using ArrayList to manage patient lists (active and discharged) with high flexibility, and avoiding hardcoding by utilizing dynamic array lengths.

### 💻 مثال تطبيقي من الكود (Early Exit Pattern):
```java
public static void dischargePatient() {
    System.out.println("Enter Patient Number: ");
    int patientNumber = Main.input.nextInt();
    
    // Find the patient
    Patient targetPatient = findPatient(patientNumber);
    
    // Early exit: if patient not found, exit the method immediately
    if (targetPatient == null) {
        System.out.println("Patient not found.");
        return; 
    }
    
    System.out.println("Patient discharged successfully!");
}
```

---

<details>
  <summary>⚙️ <b>اضغط هنا لرؤية خطوات تشغيل المشروع</b></summary>
  
  <br>
  
  1. افتح المجلد في برنامج VS Code.
  2. تأكد من تثبيت بيئة عمل Java (JDK).
  3. قم بتشغيل ملف Main.java.
  4. اتبع التعليمات في الـ Terminal لاختيار الأوامر.

</details>

# 🎓 Student Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Architecture](https://img.shields.io/badge/Architecture-MVC-red?style=for-the-badge) ![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

نظام مصغر لإدارة بيانات الطلاب، مبني بلغة Java باستخدام معمارية MVC (Models, Controllers, MainApp).
## ✨ المميزات (Features)
1. إضافة الطلاب: تسجيل أسماء الطلاب ودرجاتهم بنظام آمن يمنع أخطاء الإدخال.
2. عرض البيانات: طباعة قائمة الطلاب بشكل جدول مرتب ومنسق.
3. الفرز الذكي (Sorting): ترتيب الطلاب تنازلياً (من الأعلى للأقل) بناءً على الدرجات باستخدام واجهة Comparable.

## 🚀 التقنيات والأساليب البرمجية
* Object-Oriented Programming (OOP)
* Collections (ArrayList & Sorting)
* Clean Architecture & Defensive Programming

```java
### 💻 مثال تطبيقي من الكود (البحث عن طالب):

public static Student findStudent(int studentId) {
    // Data validation and searching for the student
    for (Student s : studentList) {
        if (s.getId() == studentId) {
            return s; // Return the student immediately if found
        }
    }
    
    // If loop finishes without finding the student
    System.out.println("Student not found.");
    return null; 
}
```
---

<details>
  <summary>⚙️ <b>اضغط هنا لرؤية خطوات تشغيل المشروع</b></summary>
  
  <br>
  
  1. افتح مجلد Student_System في برنامج VS Code.
  2. تأكد من تثبيت بيئة عمل Java (JDK).
  3. قم بتشغيل ملف الـ Main الخاص بالنظام.
  4. اتبع التعليمات في الـ Terminal لإدخال بيانات الطلاب وعرضها.

</details>
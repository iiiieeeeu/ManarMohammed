# 🏥 Hospital Management System

نظام متكامل لإدارة المرضى والخدمات الطبية مبني بلغة Java، يطبق مفاهيم الـ OOP المعمارية والتنظيم باستخدام الـ Packages.

##✨ المميزات (Features)
* إضافة مرضى جدد مع توليد أرقام فريدة تلقائياً.
* تخصيص خدمات طبية للمرضى وحساب الفواتير ديناميكياً.
* نظام حماية متقدم من أخطاء الذاكرة (NullPointerException).

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
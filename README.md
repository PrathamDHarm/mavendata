This project aims to develop a personnel managment system for a university, focusing on managing professor and their associated courses. the system comprises two main classes: 'Person' and 'professor'. The 'person' class encapsulates basic attributes such as name and age with validation. The 'Professor' class extends 'Person', adding the ability to manage courses using a 'HashSet' for efficient addition and remova. the system allows adminstratorsto track and update professor details and courses, improving the organisation of acamedic staff. A 'main' class demonstrates the pratical use of these classes.

**Method Used**
**Person Class**
1. **Constructor**: Initializes `name` and `age` with validation.
2. **getName()**: returns the name.
3. **setName(String name)**:  Sets the name with validation.
4. **getAge()**: returns the age.
5. **setAge(double age)**: Sets the age wiht validationn.
6. **displayDetails()**: Displays name and age.

**Professor Class**
1. **Constructor**: Initializes `name` and `age`and an empty `HashSet` for courses.
2. **addCourse(String course)**: Adds a course to the set with validation.
3. **removeCourse(String course)**: Removes a course from the set.
4. **getCourses()**: Returns the set of courses.
5. **displayDetails()**: Display name,age, and courses by verriding `Person`'s method.

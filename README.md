# library_java
Only needed test and documentation, no main function was implemented

```
mvn test
```


# Abstract classes Book and Person
Book:
- title (String)
- author (String)
- ISBN (String)
- is_checkout_out (bool)

Person
- name (String)
- id (String)

# Classes with inheretence 
Staff from person
- register_book
- register_member

Member from person (no additional methods)

NonFiction from Book
- override describe

Fiction from Book
- override describe

Library
- books
- members
- staff
- add_book(Book book)
- register_member(Member member)
- List_Books()
- List_member()
- List_staff

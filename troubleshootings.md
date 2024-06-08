### MAVEN Error : ' “Declared package does not match the expected package”'  Error
Most of the time  the solution is to re-open the editor because the changes aren't tracked anymore.
If the error persist it means that the package path aren't well indicated, most of the time due to the **[standard directory layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) of Maven**, it will have this structure : **com.packageName**, in other words exactly the groupId indicated.

**Annexes** related:
- [Baeldung article](https://www.baeldung.com/java-declared-expected-package-error)
- [SOF issue](https://stackoverflow.com/questions/6997524/the-declared-package-does-not-match-the-expected-package) 
- [Andres Almiray - Mastering Maven: Resolving Dependencies](https://blogs.oracle.com/developers/post/mastering-maven-resolving-dependencies)
---

<h3>Intent</h3>

Ensure a class only has one instance, and provide a global point of access to it.

<h3>Motivation</h3>

There are several system components that should have only one instance: printer spooler,
file system, A/D converter, etc.

To ensure this, let the class be responsible for keeping track of its sole instance. 

<h3>Applicability</h3>

There must be exactly one instance of a class, and it must be accessible to clients 
from a well-known access point.

When the sole instance should be extensible by subclassing and clients should be 
able to use an extended instance without modifying their code. 

<h3>Criticism</h3>
* Introduces global state 
* Dependency on singleton can make unit testing difficult 
* Violation of single-responsibility because they are responsible for enforcing uniqueness as well as their normal functions.
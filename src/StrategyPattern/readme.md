Strategy Pattern - defines a family of algorithms encapsulates each one, and makes them interchangeable, Strategy lets the algorithm vary independently from clients that use it.

HAS-A can be better than IS-A

The HAS-A relationship is an interesting one: each duck has a FlyBehavior and a QuackBehavior to
which it delegates flying and quacking.

When to use ?
- When you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
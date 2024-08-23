# Shape-Inheritance
CMSC335 Project 1
The purpose of the package is to demonstrate inheritance hierarchy
implementation.

Shape is the base class for TwoDimensionalShape and ThreeDimensionalShape.
Both TwoDimensionalShape and ThreeDimensionalShape have multiple child classes.
Specific child classes of each are obvious and were implemented in accordance
with the .pdf file containing project requirements.

Grandchild classes (the classes which represent individual shapes,
such as Square) utilize the inherited area or volume field to store
their respective area or volume value, depending on whether they are
two-dimensional or three-dimensional.
These classes also utilize the inherited Chooser object, which performs
input validation while aiding in instantiating the classes.

Because the user does not have the ability to set the number of dimesnions
explicitly, there seemed to be no need to add input validation while
constructing shape objects. Instead, the number of dimensions is used
to both set the proper number of dimensions for a given shape (i.e. 2 for
a square, three for a cube, etc.) and create an "end shape".
The end shape has 0 dimensions and because such a shape does exist
its dimension value is used to indicate that the program should be
terminated.

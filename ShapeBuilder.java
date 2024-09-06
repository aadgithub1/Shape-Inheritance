// // ShapeBuilder.java
// // Aug 23 2024
// // Aaron D. Webb
// // ShapeBuilder.java builds shapes.
// // The createShape(String key) method returns
// // a certain shape based on the key value passed in.
// // This method is used in the Main class to return
// // a particular shape based on user input.

// //The class also contains a date object which represents the
// // current day and a SimpleDateFormat, which
// // allows the date to be formatted per the assignement
// // requirements.
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class ShapeBuilder {
//     Date date = new Date();
//     SimpleDateFormat formatter = new SimpleDateFormat("MMM d 'at' h:mm a");
//     public ShapeBuilder(){
//     }

//     public Shape creatShape(int key){
//         switch (key) {
//             case 1:
//                 return new Circle(2);
//             case 2:
//                 return new Rectangle(2);
//             case 3:
//                 return new Square(2);
//             case 4:
//                 return new Triangle(2);
//             case 5:
//                 return new Sphere(3);
//             case 6:
//                 return new Cube(3);
//             case 7:
//                 return new Cone(3);
//             case 8:
//                 return new Cylinder(3);
//             case 9:
//                 return new Torus(3);
//             case 10:
//                 printThankYouMsg();
//                 return new Shape(0);
//             default:
//                 return new Shape(1);
//         }
//     }

//     public void printThankYouMsg(){
//         System.out.println("Thanks for using the program. Today is " + formatter.format(date) + ".");
//     }
// }

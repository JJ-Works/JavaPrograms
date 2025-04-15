//4. Identify and fix the error in the following Java code:

         //
        //      public class Bike {
        //
        //          String model;
        //
        //          int speed;
        //
        //
        //
        //          public void Bike(String model, int speed) {
        //
        //              this.model = model;
        //
        //              this.speed = speed;
        //      }
        //   }

         public class Bike {
             String model;
             int speed;

             // Constructor cannot have void type in it
             public Bike(String model, int speed) {
                 this.model = model;
                 this.speed = speed;
             }

         }

import javax.swing.JOptionPane;

public class ShapesArea_JacksonKatherine 
{

    public static void main(String[] args) 
    {
        
        JOptionPane.showMessageDialog(null, "Welcome!", "", JOptionPane.INFORMATION_MESSAGE);
        intro();
    }

    public static void intro()
    {
        //declaring variables
        String choice;

        //user chooses which calculation
        choice = JOptionPane.showInputDialog(null, "Would you like to calculate area or perimeter?", "", JOptionPane.QUESTION_MESSAGE);

        //decision structure for next message
        if (choice.equalsIgnoreCase("area"))
        {
            areaChoice();
        }
        else if (choice.equalsIgnoreCase("perimeter"))
        {
            perimeterChoice();
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Try again", "", JOptionPane.ERROR_MESSAGE);
            intro();
        }
    }

    public static void areaChoice()
    {
        String shape;
        shape = JOptionPane.showInputDialog(null, "Rectangle, circle, or triangle?", "", JOptionPane.QUESTION_MESSAGE);

        if (shape.equalsIgnoreCase("rectangle"))
        {
            rectangleArea();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (shape.equalsIgnoreCase("circle"))
        {
            circleArea();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (shape.equalsIgnoreCase("triangle"))
        {
            triangleArea();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Try again", "", JOptionPane.ERROR_MESSAGE);
            areaChoice();
        }
    }

    public static void perimeterChoice()
    {
        String shape;
        shape = JOptionPane.showInputDialog(null, "Rectangle, circle, or triangle?", "", JOptionPane.QUESTION_MESSAGE);

        if (shape.equalsIgnoreCase("rectangle"))
        {
            rectanglePerimeter();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (shape.equalsIgnoreCase("circle"))
        {
            circlePerimeter();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (shape.equalsIgnoreCase("triangle"))
        {
            trianglePerimeter();
            String runAgain = JOptionPane.showInputDialog(null, "Do you want to run the program again? yes/no: ", "", JOptionPane.QUESTION_MESSAGE);
            if (runAgain.equalsIgnoreCase("yes"))
            {
                intro();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Thank you for using this calculator! Goodbye!", "", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid input. Try again", "", JOptionPane.ERROR_MESSAGE);
            perimeterChoice();
        }
    }

    public static void rectangleArea()
    {
        /*Pi ai was used to write this code
         * Prompt: I need a JAVA program that uses JOptionPane to calculate the area of a rectangle
         * The following code was the output
         */
        // Prompt the user to input the length and width of the rectangle
        String input = JOptionPane.showInputDialog(null, "Enter the length and width of the rectangle, separated by a comma (e.g. 10,20): ", "", JOptionPane.QUESTION_MESSAGE);

        // Extract the length and width from the input string
        String[] values = input.split(",");
        double length = Double.parseDouble(values[0]);
        double width = Double.parseDouble(values[1]);
 
        // Calculate the area of the rectangle
        double area = length * width;
 
        // Display the result to the user
        JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area + " square units.", "Rectangle Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void circleArea()
    {
        /*
         * Pi ai was used to write this code
         * Prompt: I need a few more JAVA programs that use JOptionPane to calculate the area of different shapes.
         */
        String input = JOptionPane.showInputDialog(null, "Enter the radius of the circle: ", "", JOptionPane.QUESTION_MESSAGE);
        double radius = Double.parseDouble(input);
        double area = Math.PI * Math.pow(radius, 2);
        JOptionPane.showMessageDialog(null, "The area of the circle is " + area + " square units.", "Circle Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void triangleArea()
    {
        /*
         * Pi ai was used to write this code
         * Prompt: I need a few more JAVA programs that use JOptionPane to calculate the area of different shapes.
         */
        String input = JOptionPane.showInputDialog(null, "Enter the base and height of the triangle, separated by a comma (e.g. 5,10): ", "", JOptionPane.QUESTION_MESSAGE);
        String[] values = input.split(",");
        double base = Double.parseDouble(values[0]);
        double height = Double.parseDouble(values[1]);
        double area = 0.5 * base * height;
        JOptionPane.showMessageDialog(null, "The area of the triangle is " + area + " square units.", "Triangle Area Calculator", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void rectanglePerimeter()
    {      
        //collecting user input
        String input = JOptionPane.showInputDialog(null, "Enter the length and width of the rectangle, separated by a comma (e.g. 10,20): ", "", JOptionPane.QUESTION_MESSAGE);
        String[] values = input.split(",");
        double length = Double.parseDouble(values[0]);
        double width = Double.parseDouble(values[1]);

        //calculations
        double perimeter = 2 * (length + width);

        //output
        JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is " + perimeter, "Rectangle Perimeter Calculator", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void circlePerimeter()
    {
        //collecting user input
        String input = JOptionPane.showInputDialog(null, "Enter the radius: ", "", JOptionPane.QUESTION_MESSAGE);
        double radius = Double.parseDouble(input);

        //calculations
        double circumference = 2 * Math.PI * radius;

        //output
        JOptionPane.showMessageDialog(null, "The circumference of the circle is " + circumference, "Circle Circumference Calculator", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void trianglePerimeter()
    {
        //collecting user input
        String input = JOptionPane.showInputDialog(null, "Enter the length of each side, separated by a comma (e.g. 10,20,30): ", "", JOptionPane.QUESTION_MESSAGE);
        String[] values = input.split(",");
        double side1 = Double.parseDouble(values[0]);
        double side2 = Double.parseDouble(values[1]);
        double side3 = Double.parseDouble(values[2]);

        //calculations
        double perimeter = side1 + side2+ side3;

        //output
        JOptionPane.showMessageDialog(null, "The perimeter of the triangle is " + perimeter, "Triangle Perimeter Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}

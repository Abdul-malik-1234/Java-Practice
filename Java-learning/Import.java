/* The below code will not work because java compiler don't know from where this ArrayList came from */
// class Import{
//     public static void main(String[] args){
//         ArrayList l = new ArrayList();
//     }
// }

/*To fix above error we've 2 ways 
1.Using Fully Qualified name
2.Using Import statement
*/
/*1.Using fully Qualified name , compiles and works but readability gots damaged  */
// class Import{
//     public static void main(String[] args){
//         java.util.ArrayList l = new java.util.ArrayList();
//     }
// }

/*Using Implicit import */
// import java.util.*;
// class Import{
//     public static void main(String[] args){
//         ArrayList l=new ArrayList();
//     }
// }

/*Using Explicit import */
//More readable and mostly used in software world
import java.util.ArrayList;
class Import{
    public static void main(String[] args){
        ArrayList l=new ArrayList();
    }
}
package Oops;

/**
 * The type Oops practice.
 */
//• In	java	there	is	an	area	inside	main	memory	which	is	known	as
//method	area	which	contains	all	the	methods.
//• The	definitions	of	the class 	will	be	present	inside	the	heap,	as	the	objects
//will	be	based	on	the	definitions	so	the	objects	are	also	present	in
//heap.
public class OopsPractice {
    //class and  objects
    private String name;
    private String college;

    /**
     * Instantiates a new Oops practice.
     *
     * @param name    the name
     * @param college the college
     */
//class creation
    public OopsPractice(String name, String college) { //constructor
        super();
        this.name = name;
        this.college = college;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public String setName(String name) {
        this.name = name;
        return name;
    }

    /**
     * Gets college.
     *
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * Sets college.
     *
     * @param college the college
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //object creation
        OopsPractice student = new OopsPractice("ayushi", "ims");
        OopsPractice student2 = new OopsPractice("ayu", "ukg");

        System.out.println(student.setName("aa"));
        System.out.println(student.name+student2.college);
    }

//    Object	is	defined	in	terms	of	its	properties	and	behaviour.
//    Operation	of	behaviours	will	affect	the	properties.
//• Anything	in	the	world	can	be	defined	in	the	terms	of	properties	and
//    behaviour.
//• For	a single class	wee	can	have	many	objects.
// multiple	number	of	objects	can	be	created	by	one	single	class


//     For	Example
//    A	old	style	television	(idiot	box)	is	transformed	with	extra	features	into	slim	and
//    smart	television	where	it	re-used	the	properties	of	old	television.
//    For example
//    A house or a car or a television is an object but the design or blueprint of the
//    object is a class.


}

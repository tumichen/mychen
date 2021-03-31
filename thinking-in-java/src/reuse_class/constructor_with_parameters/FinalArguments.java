package reuse_class.constructor_with_parameters;
class Gizmo{
    void spin(){

    }
}
class FinalArguments {
    void with(final Gizmo g){
        //g = new Gizmo();
    }
    void whthOut(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
}

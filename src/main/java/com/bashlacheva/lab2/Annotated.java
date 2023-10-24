package com.bashlacheva.lab2;

public class Annotated {
    @Annotation(count = 2)
    private void annotatedPrivate() {
        System.out.println("run annotated private method");
    }

    private void notAnnotatedPrivate() {
        System.out.println("not annotated private method");
    }

    @Annotation(count = 4)
    protected void annotatedProtected() {
        System.out.println("run annotated protected method");
    }

    protected void notAnnotatedProtected() {
        System.out.println("not annotated protected method");
    }

    @Annotation
    public void annotatedPublic() {
        System.out.println("annotated public method");
    }

    public void notAnnotatedPublic() {
        System.out.println("not annotated public method");
    }
}

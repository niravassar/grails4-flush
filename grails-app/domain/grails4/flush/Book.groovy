package grails4.flush

class Book {
    String title

    static mapping = {
        id generator: 'increment'
    }
}

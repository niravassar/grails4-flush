package grails4.flush

import grails.gorm.transactions.Transactional
import org.hibernate.SessionFactory

@Transactional
class BookService {

    SessionFactory sessionFactory

    void run() {
        new Book(title: "NiravBook").save()
        new Book(title: "RobBook").save()
        //sessionFactory.getCurrentSession().flush()
        Book book = Book.findByTitle("NiravBook")
        println book.title
    }
}

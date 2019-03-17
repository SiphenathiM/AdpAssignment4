package za.ac.cput.AdpAssignment4.SoftwarePrinciples.ISP;

// interface segregation principle - bad example
public class Bad {


    interface IWorker {
        public void work();
        public void eat();
    }

    class Worker implements IWorker{
        public void work() {
            // ....working
        }
        public void eat() {
            // ...... eating in launch break
        }
    }

    class SuperWorker implements IWorker{
        public void work() {
            //.... working much more
        }

        public void eat() {
            //.... eating in launch break
        }
    }

    class Manager {
        IWorker worker;

        public void setWorker(IWorker w) {
            worker=w;
        }

        public void manage() {
            worker.work();
        }
    }

}

package za.ac.cput.AdpAssignment4.SoftwarePrinciples.DIP;

public class Bad {

    // Dependency Inversion Principle - Bad example

    class Worker {

        public void work() {

            // ....working
        }

    }



    class Manager {

        Worker worker;



        public void setWorker(Worker w) {
            worker = w;
        }

        public void manage() {
            worker.work();
        }
    }

    class SuperWorker {
        public void work() {
            //.... working much more
        }
    }

}

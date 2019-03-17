package za.ac.cput.AdpAssignment4.SoftwarePrinciples.SRP;

public class Bad {

    // single responsibility principle - bad example

    interface IEmail {
        public void setSender(String sender);
        public void setReceiver(String receiver);
        public void setContent(String content);
    }

    class Email implements IEmail {
        public void setSender(String sender) {}
            public void setReceiver(String receiver) { }
                public void setContent(String content) {}
                }
}

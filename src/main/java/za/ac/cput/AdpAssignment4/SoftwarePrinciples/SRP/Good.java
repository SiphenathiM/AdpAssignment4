package za.ac.cput.AdpAssignment4.SoftwarePrinciples.SRP;



    // single responsibility principle - good example
    interface IEmail {
        public void setSender(String sender);
        public void setReceiver(String receiver);
        public void setContent(IContent content);

        class IContent {
        }
    }

    interface Content {
        public String getAsString(); // used for serialization
    }

    class Email implements IEmail {
        public void setSender(String sender) { }
            public void setReceiver(String receiver) { }
                public void setContent(IContent content) { }
                }


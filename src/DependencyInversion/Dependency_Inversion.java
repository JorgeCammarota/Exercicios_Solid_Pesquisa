package DependencyInversion;

public class Dependency_Inversion {
    interface MessageSender {
        void sendMessage(String message);
    }

    class EmailSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    class SMSSender implements MessageSender {
        public void sendMessage(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    class NotificationService {
        private MessageSender sender;

        public NotificationService(MessageSender sender) {
            this.sender = sender;
        }

        public void sendNotification(String message) {
            sender.sendMessage(message);
        }
    }

}

//package oop.pattern.observer.pseudocode;
//
//import javax.mail.*;
//import javax.mail.internet.*;
//
//class EmailAlertsListener implements EventListener {
//    private final String email;
//    private final String message;
//
//    EmailAlertsListener(String email, String message) {
//        this.email = email;
//        this.message = message;
//    }
//
//    @Override
//    public void update(String fileName) {
//        sendEmail(email, message.replace("%s", fileName));
//    }
//
//    private void sendEmail(String recipientEmail, String messageBody) {
//        // Thông tin tài khoản email của bạn
//        String username = "your_email@gmail.com";
//        String password = "your_password";
//
//        // Cấu hình Properties
//        java.util.Properties props = new java.util.Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        // Tạo một phiên làm việc mới
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            // Tạo một tin nhắn mới
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("File Alert");
//            message.setText(messageBody);
//
//            // Gửi email
//            Transport.send(message);
//
//            System.out.println("Email sent successfully!");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

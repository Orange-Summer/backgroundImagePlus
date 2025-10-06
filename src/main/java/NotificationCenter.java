import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;

/**
 * @author Orange Summer
 * @version 1.0
 * @classname NotificationCenter
 * @description TODO
 * @createTime 2025/10/5
 */
public class NotificationCenter {
    static void notice(String message) {
        Notification n = new Notification(
                "extras",
                "Notice",
                message,
                NotificationType.INFORMATION);
        Notifications.Bus.notify(n);
    }
}

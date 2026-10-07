package u3;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static String a(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.C());
        return sb2.toString();
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static String c(StringBuilder sb2, int i, String str) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder d(int i, int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder e(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int h(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("ERROR_INVALID_CUSTOM_TOKEN")) {
            return 1;
        }
        if (str.equals("ERROR_CUSTOM_TOKEN_MISMATCH")) {
            return 2;
        }
        if (str.equals("ERROR_INVALID_CREDENTIAL")) {
            return 3;
        }
        if (str.equals("ERROR_INVALID_EMAIL")) {
            return 4;
        }
        if (str.equals("ERROR_WRONG_PASSWORD")) {
            return 5;
        }
        if (str.equals("ERROR_USER_MISMATCH")) {
            return 6;
        }
        if (str.equals("ERROR_REQUIRES_RECENT_LOGIN")) {
            return 7;
        }
        if (str.equals("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL")) {
            return 8;
        }
        if (str.equals("ERROR_EMAIL_ALREADY_IN_USE")) {
            return 9;
        }
        if (str.equals("ERROR_CREDENTIAL_ALREADY_IN_USE")) {
            return 10;
        }
        if (str.equals("ERROR_USER_DISABLED")) {
            return 11;
        }
        if (str.equals("ERROR_USER_TOKEN_EXPIRED")) {
            return 12;
        }
        if (str.equals("ERROR_USER_NOT_FOUND")) {
            return 13;
        }
        if (str.equals("ERROR_INVALID_USER_TOKEN")) {
            return 14;
        }
        if (str.equals("ERROR_OPERATION_NOT_ALLOWED")) {
            return 15;
        }
        if (str.equals("ERROR_TOO_MANY_REQUESTS")) {
            return 16;
        }
        if (str.equals("ERROR_WEAK_PASSWORD")) {
            return 17;
        }
        if (str.equals("ERROR_EXPIRED_ACTION_CODE")) {
            return 18;
        }
        if (str.equals("ERROR_INVALID_ACTION_CODE")) {
            return 19;
        }
        if (str.equals("ERROR_INVALID_MESSAGE_PAYLOAD")) {
            return 20;
        }
        if (str.equals("ERROR_INVALID_RECIPIENT_EMAIL")) {
            return 21;
        }
        if (str.equals("ERROR_INVALID_SENDER")) {
            return 22;
        }
        if (str.equals("ERROR_MISSING_EMAIL")) {
            return 23;
        }
        if (str.equals("ERROR_MISSING_PASSWORD")) {
            return 24;
        }
        if (str.equals("ERROR_MISSING_PHONE_NUMBER")) {
            return 25;
        }
        if (str.equals("ERROR_INVALID_PHONE_NUMBER")) {
            return 26;
        }
        if (str.equals("ERROR_MISSING_VERIFICATION_CODE")) {
            return 27;
        }
        if (str.equals("ERROR_INVALID_VERIFICATION_CODE")) {
            return 28;
        }
        if (str.equals("ERROR_MISSING_VERIFICATION_ID")) {
            return 29;
        }
        if (str.equals("ERROR_INVALID_VERIFICATION_ID")) {
            return 30;
        }
        if (str.equals("ERROR_RETRY_PHONE_AUTH")) {
            return 31;
        }
        if (str.equals("ERROR_SESSION_EXPIRED")) {
            return 32;
        }
        if (str.equals("ERROR_QUOTA_EXCEEDED")) {
            return 33;
        }
        if (str.equals("ERROR_APP_NOT_AUTHORIZED")) {
            return 34;
        }
        if (str.equals("ERROR_API_NOT_AVAILABLE")) {
            return 35;
        }
        if (str.equals("ERROR_WEB_CONTEXT_CANCELED")) {
            return 36;
        }
        if (str.equals("ERROR_UNKNOWN")) {
            return 37;
        }
        throw new IllegalArgumentException("No enum constant com.firebase.ui.auth.util.FirebaseAuthError.".concat(str));
    }
}

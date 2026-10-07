package g7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbbs;
import e6.r3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f4230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4231d;
    public static final b e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new r3(9);

    public b(int i, int i10, PendingIntent pendingIntent, String str) {
        this.f4228a = i;
        this.f4229b = i10;
        this.f4230c = pendingIntent;
        this.f4231d = str;
    }

    public static String g(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbbs.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return q1.a.j(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4229b == bVar.f4229b && i0.m(this.f4230c, bVar.f4230c) && i0.m(this.f4231d, bVar.f4231d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4229b), this.f4230c, this.f4231d});
    }

    public final String toString() {
        aa.c cVar = new aa.c(this);
        cVar.b(g(this.f4229b), "statusCode");
        cVar.b(this.f4230c, "resolution");
        cVar.b(this.f4231d, "message");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = com.bumptech.glide.d.P(20293, parcel);
        com.bumptech.glide.d.R(parcel, 1, 4);
        parcel.writeInt(this.f4228a);
        com.bumptech.glide.d.R(parcel, 2, 4);
        parcel.writeInt(this.f4229b);
        com.bumptech.glide.d.J(parcel, 3, this.f4230c, i, false);
        com.bumptech.glide.d.K(parcel, 4, this.f4231d, false);
        com.bumptech.glide.d.Q(iP, parcel);
    }

    public b(int i) {
        this(1, i, null, null);
    }

    public b(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}

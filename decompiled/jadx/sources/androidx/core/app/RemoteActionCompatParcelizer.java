package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o2.a;
import o2.b;
import o2.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarH = remoteActionCompat.f579a;
        boolean z4 = true;
        if (aVar.e(1)) {
            cVarH = aVar.h();
        }
        remoteActionCompat.f579a = (IconCompat) cVarH;
        CharSequence charSequence = remoteActionCompat.f580b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).e);
        }
        remoteActionCompat.f580b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f581c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).e);
        }
        remoteActionCompat.f581c = charSequence2;
        remoteActionCompat.f582d = (PendingIntent) aVar.g(remoteActionCompat.f582d, 4);
        boolean z10 = remoteActionCompat.e;
        if (aVar.e(5)) {
            z10 = ((b) aVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z10;
        boolean z11 = remoteActionCompat.f583f;
        if (!aVar.e(6)) {
            z4 = z11;
        } else if (((b) aVar).e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.f583f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f579a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f580b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f581c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f582d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.e;
        aVar.i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z10 = remoteActionCompat.f583f;
        aVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}

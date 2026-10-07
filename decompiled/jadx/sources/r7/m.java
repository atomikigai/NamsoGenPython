package r7;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends zza {
    public final q7.a I(q7.b bVar, String str, int i, q7.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        zzc.zze(parcelZza, bVar2);
        return v.o(zzB(8, parcelZza));
    }

    public final q7.a J(q7.b bVar, String str, int i) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return v.o(zzB(4, parcelZza));
    }

    public final q7.a y(q7.b bVar, String str, int i) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        return v.o(zzB(2, parcelZza));
    }
}

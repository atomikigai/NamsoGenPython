package g7;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends zzb implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4259b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4260a;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        i0.b(bArr.length == 25);
        this.f4260a = Arrays.hashCode(bArr);
    }

    public static byte[] y(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] I();

    public final boolean equals(Object obj) {
        q7.a aVarZzd;
        if (obj != null && (obj instanceof d0)) {
            try {
                d0 d0Var = (d0) obj;
                if (d0Var.zzc() == this.f4260a && (aVarZzd = d0Var.zzd()) != null) {
                    return Arrays.equals(I(), (byte[]) q7.b.I(aVarZzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4260a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) {
        if (i == 1) {
            q7.a aVarZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, aVarZzd);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f4260a);
        }
        return true;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final int zzc() {
        return this.f4260a;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final q7.a zzd() {
        return new q7.b(I());
    }
}

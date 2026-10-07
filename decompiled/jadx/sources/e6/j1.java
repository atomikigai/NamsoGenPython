package e6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbpf;
import com.google.android.gms.internal.ads.zzbpg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 extends zzayd implements k1 {
    public j1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzayd
    public final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        u1 s1Var;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                zzaye.zzc(parcel);
                zzq(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzaye.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                q7.a aVarY = q7.b.y(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzaye.zzc(parcel);
                zzn(aVarY, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                q7.a aVarY2 = q7.b.y(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzl(string3, aVarY2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i11 = zzaye.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzaye.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbpg zzbpgVarZzf = zzbpf.zzf(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzo(zzbpgVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzblw zzblwVarZzc = zzblv.zzc(parcel.readStrongBinder());
                zzaye.zzc(parcel);
                zzs(zzblwVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                i3 i3Var = (i3) zzaye.zza(parcel, i3.CREATOR);
                zzaye.zzc(parcel);
                zzu(i3Var);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    s1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    s1Var = iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzaye.zzc(parcel);
                zzm(s1Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = zzaye.zzg(parcel);
                zzaye.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzaye.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

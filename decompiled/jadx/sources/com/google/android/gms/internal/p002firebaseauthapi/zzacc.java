package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import r7.g;
import v9.s;
import w9.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzacc extends zzaez {
    private final String zza;
    private final String zzb;

    public zzacc(String str, String str2) {
        super(4);
        i0.f(str, "code cannot be null or empty");
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    public final void zzb() {
        char c10;
        zzahk zzahkVar = this.zzq;
        y yVar = new y();
        if (zzahkVar.zzh()) {
            zzahkVar.zzd();
        } else {
            zzahkVar.zzc();
        }
        zzahkVar.zzc();
        if (zzahkVar.zzi()) {
            switch (zzahkVar.zze()) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c10 = 6;
                    break;
                case "PASSWORD_RESET":
                    c10 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c10 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    c10 = 5;
                    break;
                case "EMAIL_SIGNIN":
                    c10 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c10 = 2;
                    break;
                default:
                    c10 = 3;
                    break;
            }
            if (c10 != 4 && c10 != 3) {
                if (zzahkVar.zzg()) {
                    String strZzc = zzahkVar.zzc();
                    s sVarJ = g.J(zzahkVar.zzb());
                    i0.e(strZzc);
                    i0.i(sVarJ);
                } else if (zzahkVar.zzh()) {
                    String strZzd = zzahkVar.zzd();
                    String strZzc2 = zzahkVar.zzc();
                    i0.e(strZzd);
                    i0.e(strZzc2);
                } else if (zzahkVar.zzf()) {
                    i0.e(zzahkVar.zzc());
                }
            }
        }
        zzm(yVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafb
    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzadyVar) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzadyVar.zzd(this.zza, this.zzb, this.zzf);
    }
}

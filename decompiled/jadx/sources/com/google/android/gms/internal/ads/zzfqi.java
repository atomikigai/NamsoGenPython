package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import b6.b;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfqi {
    private final Context zza;
    private final Executor zzb;
    private final zzfpp zzc;
    private final zzfpr zzd;
    private final zzfqh zze;
    private final zzfqh zzf;
    private Task zzg;
    private Task zzh;

    public zzfqi(Context context, Executor executor, zzfpp zzfppVar, zzfpr zzfprVar, zzfqf zzfqfVar, zzfqg zzfqgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfppVar;
        this.zzd = zzfprVar;
        this.zze = zzfqfVar;
        this.zzf = zzfqgVar;
    }

    public static zzfqi zze(Context context, Executor executor, zzfpp zzfppVar, zzfpr zzfprVar) {
        final zzfqi zzfqiVar = new zzfqi(context, executor, zzfppVar, zzfprVar, new zzfqf(), new zzfqg());
        if (zzfqiVar.zzd.zzh()) {
            zzfqiVar.zzg = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzc();
                }
            });
        } else {
            zzfqiVar.zzg = Tasks.forResult(zzfqiVar.zze.zza());
        }
        zzfqiVar.zzh = zzfqiVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzd();
            }
        });
        return zzfqiVar;
    }

    private static zzata zzg(Task task, zzata zzataVar) {
        return !task.isSuccessful() ? zzataVar : (zzata) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfqe
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zza.zzf(exc);
            }
        });
    }

    public final zzata zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzata zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    public final zzata zzc() throws Exception {
        zzasf zzasfVarZza = zzata.zza();
        b6.a aVarA = b.a(this.zza);
        String strEncodeToString = aVarA.f1406a;
        if (strEncodeToString != null && strEncodeToString.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strEncodeToString);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strEncodeToString = Base64.encodeToString(bArr, 11);
        }
        if (strEncodeToString != null) {
            zzasfVarZza.zzs(strEncodeToString);
            zzasfVarZza.zzr(aVarA.f1407b);
            zzasfVarZza.zzab(6);
        }
        return (zzata) zzasfVarZza.zzbr();
    }

    public final /* synthetic */ zzata zzd() throws Exception {
        Context context = this.zza;
        return zzfpx.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}

package com.google.android.gms.internal.ads;

import a5.f;
import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import e6.t;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzawt extends zzaxt {
    private static final zzaxu zzh = new zzaxu();
    private final zzasb zzi;
    private final Context zzj;
    private final zzatx zzk;

    public zzawt(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i, int i10, Context context, zzars zzarsVar, zzasb zzasbVar, zzatx zzatxVar) {
        super(zzawfVar, "C5H7nTBN4nltmNau+/MNt6CSB0fOzxeNv8MDz6xiw5iQrv1d68C/G+ooekFvBfaF", "+RUwiCqrIcStaeiSXRFEyI1zJGWpibshqhmF48hI+GU=", zzasfVar, i, 27);
        this.zzj = context;
        this.zzi = zzasbVar;
        this.zzk = zzatxVar;
    }

    private final zzatu zzc() throws IllegalAccessException, InvocationTargetException {
        int iZza;
        String str;
        zzbce zzbceVar = zzbcn.zzcM;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            iZza = ((Integer) tVar.f3440c.zza(zzbcn.zzcR)).intValue();
        } else {
            iZza = this.zzi.zza();
        }
        zzatu zzatuVar = new zzatu((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatx zzatxVar = this.zzk;
        if (zzatxVar == null || zzatxVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzatxVar.zza().get(iZza, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        zzatuVar.zza = str;
        return zzatuVar;
    }

    private final String zzd() {
        try {
            if (this.zza.zzl() != null) {
                this.zza.zzl().get();
            }
            zzata zzataVarZzc = this.zza.zzc();
            if (zzataVarZzc == null || !zzataVarZzc.zzaj()) {
                return null;
            }
            return zzataVarZzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzatu zzatuVarZzc;
        zzatu zzatuVar;
        AtomicReference atomicReferenceZza = zzh.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzatu zzatuVar2 = (zzatu) atomicReferenceZza.get();
                if (zzatuVar2 == null || zzawi.zzd(zzatuVar2.zza) || zzatuVar2.zza.equals("E") || zzatuVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawi.zzd(null)) {
                        zzawi.zzd(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzatuVarZzc = zzc();
                    } else {
                        boolean z4 = false;
                        if (i == 3 && !this.zzi.zzd()) {
                            z4 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z4);
                        zzbce zzbceVar = zzbcn.zzcA;
                        t tVar = t.f3437d;
                        Boolean bool = (Boolean) tVar.f3440c.zza(zzbceVar);
                        String strZzb = ((Boolean) tVar.f3440c.zza(zzbcn.zzcz)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzp() && zzawi.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzatu zzatuVar3 = new zzatu((String) this.zze.invoke(null, this.zzj, boolValueOf, strZzb));
                        if (zzawi.zzd(zzatuVar3.zza) || zzatuVar3.zza.equals("E")) {
                            int i10 = i - 1;
                            if (i10 == 3) {
                                String strZzd = zzd();
                                if (!zzawi.zzd(strZzd)) {
                                    zzatuVar3.zza = strZzd;
                                }
                            } else if (i10 == 4) {
                                throw null;
                            }
                        }
                        zzatuVarZzc = zzatuVar3;
                    }
                    atomicReferenceZza.set(zzatuVarZzc);
                }
                zzatuVar = (zzatu) atomicReferenceZza.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzd) {
            if (zzatuVar != null) {
                try {
                    this.zzd.zzx(zzatuVar.zza);
                    this.zzd.zzX(zzatuVar.zzb);
                    this.zzd.zzZ(zzatuVar.zzc);
                    this.zzd.zzi(zzatuVar.zzd);
                    this.zzd.zzw(zzatuVar.zze);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            zzbce zzbceVar = zzbcn.zzcB;
            t tVar = t.f3437d;
            byte[] bArrZzf = zzawi.zzf((String) tVar.f3440c.zza(zzbceVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawi.zzf((String) tVar.f3440c.zza(zzbcn.zzcC)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgfa zzgfaVarZze = zzgfa.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxv
                public final void onChecksumsReady(List list) {
                    zzgfa zzgfaVar = zzgfaVarZze;
                    if (list == null) {
                        zzgfaVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumC = f.c(list.get(i));
                            if (apkChecksumC.getType() == 8) {
                                zzgfaVar.zzc(zzawi.zzb(apkChecksumC.getValue()));
                                return;
                            }
                        }
                        zzgfaVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgfaVar.zzc(null);
                    }
                }
            });
            return (String) zzgfaVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import a2.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import d6.p;
import e6.s;
import h6.k0;
import h6.o0;
import h6.r0;
import h6.t;
import i6.d;
import i6.h;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzccg {
    private static final boolean zza;
    private final Context zzb;
    private final String zzc;
    private final i6.a zzd;
    private final zzbcz zze;
    private final zzbdc zzf;
    private final t zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcbl zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = s.f3427f.e.nextInt(100) < ((Integer) e6.t.f3437d.f3440c.zza(zzbcn.zzmr)).intValue();
    }

    public zzccg(Context context, i6.a aVar, String str, zzbdc zzbdcVar, zzbcz zzbczVar) {
        l lVar = new l(17);
        lVar.N("min_1", Double.MIN_VALUE, 1.0d);
        lVar.N("1_5", 1.0d, 5.0d);
        lVar.N("5_10", 5.0d, 10.0d);
        lVar.N("10_20", 10.0d, 20.0d);
        lVar.N("20_30", 20.0d, 30.0d);
        lVar.N("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = new t(lVar);
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = aVar;
        this.zzc = str;
        this.zzf = zzbdcVar;
        this.zze = zzbczVar;
        String str2 = (String) e6.t.f3437d.f3440c.zza(zzbcn.zzK);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                this.zzh[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException e) {
                h.h("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(zzcbl zzcblVar) {
        zzbcu.zza(this.zzf, this.zze, "vpc2");
        this.zzj = true;
        this.zzf.zzd("vpn", zzcblVar.zzj());
        this.zzo = zzcblVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbcu.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        zzbcu.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzd() {
        Bundle bundleW;
        if (!zza || this.zzp) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zzj());
        t tVar = this.zzg;
        String[] strArr = tVar.f5081a;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double[] dArr = tVar.f5083c;
            double[] dArr2 = tVar.f5082b;
            int[] iArr = tVar.f5084d;
            double d10 = dArr[i];
            double d11 = dArr2[i];
            int i10 = iArr[i];
            arrayList.add(new h6.s(str, d10, d11, ((double) i10) / ((double) tVar.e), i10));
            i++;
            tVar = tVar;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h6.s sVar = (h6.s) obj;
            String strValueOf = String.valueOf(sVar.f5077a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(sVar.e));
            String strValueOf2 = String.valueOf(sVar.f5077a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(sVar.f5080d));
        }
        int i12 = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i12 >= jArr.length) {
                break;
            }
            String str2 = this.zzi[i12];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i12]).toString()), str2);
            }
            i12++;
        }
        final Context context = this.zzb;
        i6.a aVar = this.zzd;
        final r0 r0Var = p.C.f2979c;
        String str3 = aVar.f5213a;
        AtomicReference atomicReference = r0Var.f5071c;
        bundle.putString("device", r0.G());
        zzbce zzbceVar = zzbcn.zza;
        e6.t tVar2 = e6.t.f3437d;
        bundle.putString("eids", TextUtils.join(",", tVar2.f3438a.zza()));
        if (bundle.isEmpty()) {
            h.b("Empty or null bundle.");
        } else {
            final String str4 = (String) tVar2.f3440c.zza(zzbcn.zzki);
            if (!r0Var.f5072d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h6.p0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str5) {
                        r0Var.f5071c.set(p3.a.w(context, str4));
                    }
                };
                if (TextUtils.isEmpty(str4)) {
                    bundleW = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    bundleW = p3.a.w(context, str4);
                }
                atomicReference.set(bundleW);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        d dVar = s.f3427f.f3428a;
        d.n(context, str3, bundle, new o0(0, context, str3));
        this.zzp = true;
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcbl zzcblVar) {
        if (this.zzl && !this.zzm) {
            if (k0.m() && !this.zzm) {
                k0.k("VideoMetricsMixin first frame");
            }
            zzbcu.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        p.C.f2983j.getClass();
        long jNanoTime = System.nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L);
            long j4 = jNanoTime - this.zzr;
            t tVar = this.zzg;
            double d10 = nanos / j4;
            tVar.e++;
            int i = 0;
            while (true) {
                double[] dArr = tVar.f5083c;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = dArr[i];
                if (d11 <= d10 && d10 < tVar.f5082b[i]) {
                    int[] iArr = tVar.f5084d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d10 < d11) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzq = this.zzn;
        this.zzr = jNanoTime;
        long jLongValue = ((Long) e6.t.f3437d.f3440c.zza(zzbcn.zzL)).longValue();
        long jZza = zzcblVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jZza - this.zzh[i10])) {
                String[] strArr2 = this.zzi;
                int i11 = 8;
                Bitmap bitmap = zzcblVar.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}

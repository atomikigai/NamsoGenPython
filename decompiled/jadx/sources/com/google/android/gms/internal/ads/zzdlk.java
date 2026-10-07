package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import e6.t;
import h6.k0;
import h6.w;
import h6.x;
import java.util.concurrent.Executor;
import n7.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdlk {
    private final x zza;
    private final n7.a zzb;
    private final Executor zzc;

    public zzdlk(x xVar, n7.a aVar, Executor executor) {
        this.zza = xVar;
        this.zzb = aVar;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        ((b) this.zzb).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ((b) this.zzb).getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j4 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z4 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbD = u3.b.d(width, height, "Decoded image w: ", " h:", " bytes: ");
            sbD.append(allocationByteCount);
            sbD.append(" time: ");
            sbD.append(j4);
            sbD.append(" on ui thread: ");
            sbD.append(z4);
            k0.k(sbD.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final Bitmap zza(double d10, boolean z4, zzapl zzaplVar) {
        byte[] bArr = zzaplVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z4) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbce zzbceVar = zzbcn.zzfZ;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) tVar.f3440c.zza(zzbcn.zzga)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final m9.a zzb(String str, final double d10, final boolean z4) {
        this.zza.getClass();
        zzcao zzcaoVar = new zzcao();
        x.f5091a.zza(new w(str, zzcaoVar));
        return zzgei.zzm(zzcaoVar, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return this.zza.zza(d10, z4, (zzapl) obj);
            }
        }, this.zzc);
    }
}

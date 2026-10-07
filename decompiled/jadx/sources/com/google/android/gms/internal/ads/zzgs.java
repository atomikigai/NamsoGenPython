package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgs extends zzfw {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgs() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i, int i10) throws zzgr {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.zzc;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i11 = zzen.zza;
            int i12 = randomAccessFile.read(bArr, i, (int) Math.min(j4, i10));
            if (i12 > 0) {
                this.zzc -= (long) i12;
                zzg(i12);
            }
            return i12;
        } catch (IOException e) {
            throw new zzgr(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgr {
        Uri uri = zzgiVar.zza;
        this.zzb = uri;
        zzi(zzgiVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgiVar.zze);
                long length = zzgiVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - zzgiVar.zze;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgr(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzgiVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzgr(e, 2000);
            }
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgr(e4, ((e4.getCause() instanceof ErrnoException) && ((ErrnoException) e4.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbE = b.e("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbE.append(fragment);
            throw new zzgr(sbE.toString(), e4, 1004);
        } catch (SecurityException e10) {
            throw new zzgr(e10, 2006);
        } catch (RuntimeException e11) {
            throw new zzgr(e11, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgr {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzgr(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}

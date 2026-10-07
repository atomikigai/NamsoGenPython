package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzhfi implements Iterator, Closeable, zzard {
    private static final zzarc zza = new zzhfh("eof ");
    protected zzaqz zzb;
    protected zzhfj zzc;
    zzarc zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhfp.zzb(zzhfi.class);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarc zzarcVar = this.zzd;
        if (zzarcVar == zza) {
            return false;
        }
        if (zzarcVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i = 0; i < this.zzg.size(); i++) {
            if (i > 0) {
                sb2.append(";");
            }
            sb2.append(((zzarc) this.zzg.get(i)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzarc next() {
        zzarc zzarcVarZzb;
        zzarc zzarcVar = this.zzd;
        if (zzarcVar != null && zzarcVar != zza) {
            this.zzd = null;
            return zzarcVar;
        }
        zzhfj zzhfjVar = this.zzc;
        if (zzhfjVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhfjVar) {
                this.zzc.zze(this.zze);
                zzarcVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzb();
            }
            return zzarcVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhfo(this.zzg, this);
    }

    public final void zze(zzhfj zzhfjVar, long j4, zzaqz zzaqzVar) throws IOException {
        this.zzc = zzhfjVar;
        this.zze = zzhfjVar.zzb();
        zzhfjVar.zze(zzhfjVar.zzb() + j4);
        this.zzf = zzhfjVar.zzb();
        this.zzb = zzaqzVar;
    }

    public void close() throws IOException {
    }
}

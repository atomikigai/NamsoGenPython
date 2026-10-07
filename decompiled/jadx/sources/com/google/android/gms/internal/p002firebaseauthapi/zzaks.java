package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzaks extends IOException {
    private zzalp zza;
    private boolean zzb;

    public zzaks(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzakr zza() {
        return new zzakr("Protocol message tag had invalid wire type.");
    }

    public static zzaks zzb() {
        return new zzaks("Protocol message end-group tag did not match expected tag.");
    }

    public static zzaks zzc() {
        return new zzaks("Protocol message contained an invalid tag (zero).");
    }

    public static zzaks zzd() {
        return new zzaks("Protocol message had invalid UTF-8.");
    }

    public static zzaks zze() {
        return new zzaks("CodedInputStream encountered a malformed varint.");
    }

    public static zzaks zzf() {
        return new zzaks("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzaks zzg() {
        return new zzaks("Failed to parse the message.");
    }

    public static zzaks zzi() {
        return new zzaks("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzaks zzj() {
        return new zzaks("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzaks zzh(zzalp zzalpVar) {
        this.zza = zzalpVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzaks(String str) {
        super(str);
        this.zza = null;
    }
}

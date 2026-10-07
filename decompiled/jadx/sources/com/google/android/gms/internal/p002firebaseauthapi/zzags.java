package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import java.util.List;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzags {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzahh zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private h0 zzl;
    private List zzm;

    public zzags() {
        this.zzf = new zzahh();
    }

    public final long zza() {
        return this.zzi;
    }

    public final long zzb() {
        return this.zzj;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final h0 zzd() {
        return this.zzl;
    }

    public final zzags zze(h0 h0Var) {
        this.zzl = h0Var;
        return this;
    }

    public final zzags zzf(String str) {
        this.zzd = str;
        return this;
    }

    public final zzags zzg(String str) {
        this.zzb = str;
        return this;
    }

    public final zzags zzh(boolean z4) {
        this.zzk = z4;
        return this;
    }

    public final zzags zzi(String str) {
        i0.e(str);
        this.zzg = str;
        return this;
    }

    public final zzags zzj(String str) {
        this.zze = str;
        return this;
    }

    public final zzags zzk(List list) {
        i0.i(list);
        zzahh zzahhVar = new zzahh();
        this.zzf = zzahhVar;
        zzahhVar.zzc().addAll(list);
        return this;
    }

    public final zzahh zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzd;
    }

    public final String zzn() {
        return this.zzb;
    }

    public final String zzo() {
        return this.zza;
    }

    public final String zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzm;
    }

    public final List zzr() {
        return this.zzf.zzc();
    }

    public final boolean zzs() {
        return this.zzc;
    }

    public final boolean zzt() {
        return this.zzk;
    }

    public zzags(String str, String str2, boolean z4, String str3, String str4, zzahh zzahhVar, String str5, String str6, long j4, long j10, boolean z10, h0 h0Var, List list) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzahh.zzb(zzahhVar);
        this.zzg = str5;
        this.zzh = str6;
        this.zzi = j4;
        this.zzj = j10;
        this.zzk = false;
        this.zzl = null;
        this.zzm = list;
    }
}

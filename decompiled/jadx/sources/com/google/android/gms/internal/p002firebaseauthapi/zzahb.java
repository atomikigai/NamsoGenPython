package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.i0;
import h7.a;
import n7.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahb extends a implements zzaek<zzahb> {
    public static final Parcelable.Creator<zzahb> CREATOR = new zzahc();
    private static final String zza = "zzahb";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahb() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public static zzahb zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahb zzahbVar = new zzahb();
            zzahbVar.zzb = jSONObject.optString("refresh_token", null);
            zzahbVar.zzc = jSONObject.optString("access_token", null);
            zzahbVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahbVar.zze = jSONObject.optString("token_type", null);
            zzahbVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahbVar;
        } catch (JSONException e) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzzr(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = d.P(20293, parcel);
        d.K(parcel, 2, this.zzb, false);
        d.K(parcel, 3, this.zzc, false);
        d.I(parcel, 4, Long.valueOf(zzb()));
        d.K(parcel, 5, this.zze, false);
        Long l2 = this.zzf;
        l2.getClass();
        d.I(parcel, 6, l2);
        d.Q(iP, parcel);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final /* bridge */ /* synthetic */ zzaek zza(String str) throws zzaca {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString("refresh_token"));
            this.zzc = g.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = g.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzain.zza(e, zza, str);
        }
    }

    public final long zzb() {
        Long l2 = this.zzd;
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    public final long zzc() {
        return this.zzf.longValue();
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzzr(e);
        }
    }

    public final void zzi(String str) {
        i0.e(str);
        this.zzb = str;
    }

    public final boolean zzj() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }

    public zzahb(String str, String str2, Long l2, String str3, Long l10) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l2;
        this.zze = str3;
        this.zzf = l10;
    }

    public zzahb(String str, String str2, Long l2, String str3) {
        this(str, str2, l2, str3, Long.valueOf(System.currentTimeMillis()));
    }
}

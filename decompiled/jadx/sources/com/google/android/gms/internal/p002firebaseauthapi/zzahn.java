package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.i0;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahn implements zzaej {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private final zzahz zzg = new zzahz(null);
    private final zzahz zzh = new zzahz(null);
    private String zzi;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        int i = 0;
        if (!this.zzh.zza().isEmpty()) {
            List listZza = this.zzh.zza();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < listZza.size(); i10++) {
                jSONArray.put(listZza.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List listZza2 = this.zzg.zza();
        int size = listZza2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < listZza2.size(); i11++) {
            String str = (String) listZza2.get(i11);
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        i = 2;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        i = 1;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        i = 4;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        i = 5;
                    }
                    break;
                default:
                    break;
            }
            iArr[i11] = i;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            while (i < size) {
                jSONArray2.put(iArr[i]);
                i++;
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzi;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final zzahn zzb(String str) {
        i0.e(str);
        this.zzh.zza().add(str);
        return this;
    }

    public final zzahn zzc(String str) {
        if (str == null) {
            this.zzg.zza().add("DISPLAY_NAME");
            return this;
        }
        this.zzb = str;
        return this;
    }

    public final zzahn zzd(String str) {
        if (str == null) {
            this.zzg.zza().add("EMAIL");
            return this;
        }
        this.zzc = str;
        return this;
    }

    public final zzahn zze(String str) {
        i0.e(str);
        this.zza = str;
        return this;
    }

    public final zzahn zzf(String str) {
        i0.e(str);
        this.zze = str;
        return this;
    }

    public final zzahn zzg(String str) {
        if (str == null) {
            this.zzg.zza().add("PASSWORD");
            return this;
        }
        this.zzd = str;
        return this;
    }

    public final zzahn zzh(String str) {
        if (str == null) {
            this.zzg.zza().add("PHOTO_URL");
            return this;
        }
        this.zzf = str;
        return this;
    }

    public final zzahn zzi(String str) {
        this.zzi = str;
        return this;
    }

    public final String zzj() {
        return this.zzb;
    }

    public final String zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzd;
    }

    public final String zzm() {
        return this.zzf;
    }

    public final boolean zzn(String str) {
        i0.e(str);
        return this.zzg.zza().contains(str);
    }
}

package o6;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdrv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbvx f7664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f7665d = new Bundle();
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7666f;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public r(JsonReader jsonReader, zzbvx zzbvxVar) throws IOException {
        zzbvx zzbvxVar2;
        Bundle bundle;
        this.e = -1L;
        this.f7666f = -1L;
        this.f7664c = zzbvxVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.e = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.f7666f = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.f7662a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f7665d.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzci)).booleanValue() || (zzbvxVar2 = this.f7664c) == null || (bundle = zzbvxVar2.zzm) == null) {
            return;
        }
        bundle.putLong(zzdrv.GET_SIGNALS_SDKCORE_START.zza(), this.e);
        this.f7664c.zzm.putLong(zzdrv.GET_SIGNALS_SDKCORE_END.zza(), this.f7666f);
    }
}

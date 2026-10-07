package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import n7.c;
import qd.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebt {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzebt zza(Reader reader) throws zzfex {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                String strNextString = "";
                jsonReader.beginObject();
                long jNextLong = -1;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), b.L(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzebt zzebtVar = new zzebt();
                zzebtVar.zza = iNextInt;
                if (strNextString != null) {
                    zzebtVar.zzc = strNextString;
                }
                zzebtVar.zzd = jNextLong;
                zzebtVar.zzb = map;
                c.d(reader);
                return zzebtVar;
            } catch (Throwable th) {
                c.d(reader);
                throw th;
            }
        } catch (IOException e) {
            e = e;
            throw new zzfex("Unable to parse Response", e);
        } catch (AssertionError e4) {
            e = e4;
            throw new zzfex("Unable to parse Response", e);
        } catch (IllegalStateException e10) {
            e = e10;
            throw new zzfex("Unable to parse Response", e);
        } catch (NumberFormatException e11) {
            e = e11;
            throw new zzfex("Unable to parse Response", e);
        }
    }
}

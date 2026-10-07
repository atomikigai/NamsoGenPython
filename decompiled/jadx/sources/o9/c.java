package o9;

import android.os.Bundle;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.zzjb;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import z7.k1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya.b f7700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f7701b = null;

    public c(ya.b bVar) {
        this.f7700a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f7695a;
        String str2 = bVar.f7696b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar2 = (b) obj;
            if (bVar2.f7695a.equals(str) && bVar2.f7696b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        r9.c cVar = (r9.c) ((r9.b) this.f7700a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f8232a.f10615a.zzq("frc", "")) {
            zzjb zzjbVar = s9.b.f8456a;
            i0.i(bundle);
            r9.a aVar = new r9.a();
            String str = (String) k1.a(bundle, "origin", String.class, null);
            i0.i(str);
            aVar.f8219a = str;
            String str2 = (String) k1.a(bundle, "name", String.class, null);
            i0.i(str2);
            aVar.f8220b = str2;
            aVar.f8221c = k1.a(bundle, "value", Object.class, null);
            aVar.f8222d = (String) k1.a(bundle, "trigger_event_name", String.class, null);
            aVar.e = ((Long) k1.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f8223f = (String) k1.a(bundle, "timed_out_event_name", String.class, null);
            aVar.f8224g = (Bundle) k1.a(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.h = (String) k1.a(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) k1.a(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f8225j = ((Long) k1.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f8226k = (String) k1.a(bundle, "expired_event_name", String.class, null);
            aVar.f8227l = (Bundle) k1.a(bundle, "expired_event_params", Bundle.class, null);
            aVar.f8229n = ((Boolean) k1.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f8228m = ((Long) k1.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f8230o = ((Long) k1.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0261  */
    public final void c(ArrayList arrayList) {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str;
        String str2;
        String str3;
        ya.b bVar = this.f7700a;
        if (bVar.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                if (arrayList2.isEmpty()) {
                    if (bVar.get() == null) {
                        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    ArrayList arrayListB = b();
                    int size2 = arrayListB.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayListB.get(i10);
                        i10++;
                        ((r9.c) ((r9.b) bVar.get())).f8232a.f10615a.zzw(((r9.a) obj).f8220b, null, null);
                    }
                    return;
                }
                if (bVar.get() == null) {
                    throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList arrayListB2 = b();
                ArrayList arrayList3 = new ArrayList();
                int size3 = arrayListB2.size();
                int i11 = 0;
                while (i11 < size3) {
                    Object obj2 = arrayListB2.get(i11);
                    i11++;
                    r9.a aVar = (r9.a) obj2;
                    String[] strArr = b.f7694g;
                    String str4 = aVar.f8222d;
                    arrayList3.add(new b(aVar.f8220b, String.valueOf(aVar.f8221c), str4 != null ? str4 : "", new Date(aVar.f8228m), aVar.e, aVar.f8225j));
                    bVar = bVar;
                    arrayListB2 = arrayListB2;
                }
                ya.b bVar2 = bVar;
                ArrayList arrayList4 = new ArrayList();
                int size4 = arrayList3.size();
                int i12 = 0;
                while (i12 < size4) {
                    Object obj3 = arrayList3.get(i12);
                    i12++;
                    b bVar3 = (b) obj3;
                    if (!a(arrayList2, bVar3)) {
                        arrayList4.add(bVar3.a());
                    }
                }
                int size5 = arrayList4.size();
                int i13 = 0;
                while (i13 < size5) {
                    Object obj4 = arrayList4.get(i13);
                    i13++;
                    ((r9.c) ((r9.b) bVar2.get())).f8232a.f10615a.zzw(((r9.a) obj4).f8220b, null, null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size6 = arrayList2.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    b bVar4 = (b) obj5;
                    if (!a(arrayList3, bVar4)) {
                        arrayList5.add(bVar4);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f7701b == null) {
                    this.f7701b = Integer.valueOf(((r9.c) ((r9.b) bVar2.get())).f8232a.f10615a.zza("frc"));
                }
                int iIntValue = this.f7701b.intValue();
                int size7 = arrayList5.size();
                int i15 = 0;
                while (i15 < size7) {
                    int i16 = i15 + 1;
                    b bVar5 = (b) arrayList5.get(i15);
                    while (arrayDeque.size() >= iIntValue) {
                        ((r9.c) ((r9.b) bVar2.get())).f8232a.f10615a.zzw(((r9.a) arrayDeque.pollFirst()).f8220b, null, null);
                    }
                    r9.a aVarA = bVar5.a();
                    r9.c cVar = (r9.c) ((r9.b) bVar2.get());
                    cVar.getClass();
                    zzjb zzjbVar = s9.b.f8456a;
                    String str5 = aVarA.f8219a;
                    if (!str5.isEmpty()) {
                        Object obj6 = aVarA.f8221c;
                        if (obj6 != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj6);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            object = null;
                                        }
                                        if (object != null) {
                                            if (!s9.b.c(str5) && s9.b.d(str5, aVarA.f8220b) && (((str = aVarA.f8226k) == null || (s9.b.b(str, aVarA.f8227l) && s9.b.a(str5, aVarA.f8226k, aVarA.f8227l))) && (((str2 = aVarA.h) == null || (s9.b.b(str2, aVarA.i) && s9.b.a(str5, aVarA.h, aVarA.i))) && ((str3 = aVarA.f8223f) == null || (s9.b.b(str3, aVarA.f8224g) && s9.b.a(str5, aVarA.f8223f, aVarA.f8224g)))))) {
                                                y7.a aVar2 = cVar.f8232a;
                                                Bundle bundle = new Bundle();
                                                bundle.putString("origin", aVarA.f8219a);
                                                String str6 = aVarA.f8220b;
                                                if (str6 != null) {
                                                    bundle.putString("name", str6);
                                                }
                                                Object obj7 = aVarA.f8221c;
                                                if (obj7 != null) {
                                                    k1.g(obj7, bundle);
                                                }
                                                String str7 = aVarA.f8222d;
                                                if (str7 != null) {
                                                    bundle.putString("trigger_event_name", str7);
                                                }
                                                bundle.putLong("trigger_timeout", aVarA.e);
                                                String str8 = aVarA.f8223f;
                                                if (str8 != null) {
                                                    bundle.putString("timed_out_event_name", str8);
                                                }
                                                Bundle bundle2 = aVarA.f8224g;
                                                if (bundle2 != null) {
                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                }
                                                String str9 = aVarA.h;
                                                if (str9 != null) {
                                                    bundle.putString("triggered_event_name", str9);
                                                }
                                                Bundle bundle3 = aVarA.i;
                                                if (bundle3 != null) {
                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                }
                                                bundle.putLong("time_to_live", aVarA.f8225j);
                                                String str10 = aVarA.f8226k;
                                                if (str10 != null) {
                                                    bundle.putString("expired_event_name", str10);
                                                }
                                                Bundle bundle4 = aVarA.f8227l;
                                                if (bundle4 != null) {
                                                    bundle.putBundle("expired_event_params", bundle4);
                                                }
                                                bundle.putLong("creation_timestamp", aVarA.f8228m);
                                                bundle.putBoolean("active", aVarA.f8229n);
                                                bundle.putLong("triggered_timestamp", aVarA.f8230o);
                                                aVar2.f10615a.zzE(bundle);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        } else if (!s9.b.c(str5)) {
                        }
                    }
                    arrayDeque.offer(aVarA);
                    i15 = i16;
                }
                return;
            }
            Object obj8 = arrayList.get(i);
            i++;
            Map map = (Map) obj8;
            String[] strArr2 = b.f7694g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = b.f7694g;
            for (int i17 = 0; i17 < 5; i17++) {
                String str11 = strArr3[i17];
                if (!map.containsKey(str11)) {
                    arrayList6.add(str11);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", b.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e4) {
                throw new a("Could not process experiment: parsing experiment start time failed.", e4);
            }
        }
    }
}

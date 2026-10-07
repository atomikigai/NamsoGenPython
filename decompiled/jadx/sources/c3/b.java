package c3;

import android.os.Build;
import fa.c1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import y1.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar, int i) {
        super(vVar);
        this.f1733d = i;
    }

    @Override // c5.a
    public final String c() {
        switch (this.f1733d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0204  */
    /* JADX WARN: Code duplicated, block: B:111:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v28 */
    public final void l(i2.k kVar, Object obj) throws Throwable {
        int i;
        int i10;
        ?? byteArrayOutputStream;
        Throwable th;
        ?? r10;
        ?? r11;
        switch (this.f1733d) {
            case 0:
                a aVar = (a) obj;
                String str = aVar.f1731a;
                if (str == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str);
                }
                String str2 = aVar.f1732b;
                if (str2 == null) {
                    kVar.I(2);
                    return;
                } else {
                    kVar.j(2, str2);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str3 = cVar.f1734a;
                if (str3 == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str3);
                }
                Long l2 = cVar.f1735b;
                if (l2 == null) {
                    kVar.I(2);
                    return;
                } else {
                    kVar.b(2, l2.longValue());
                    return;
                }
            case 2:
                d dVar = (d) obj;
                String str4 = dVar.f1736a;
                if (str4 == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str4);
                }
                kVar.b(2, dVar.f1737b);
                return;
            case 3:
                f fVar = (f) obj;
                fVar.getClass();
                kVar.I(1);
                String str5 = fVar.f1739a;
                if (str5 == null) {
                    kVar.I(2);
                    return;
                } else {
                    kVar.j(2, str5);
                    return;
                }
            case 4:
                g gVar = (g) obj;
                String str6 = gVar.f1740a;
                if (str6 == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str6);
                }
                byte[] bArrC = t2.f.c(gVar.f1741b);
                if (bArrC == null) {
                    kVar.I(2);
                    return;
                } else {
                    kVar.w(2, bArrC);
                    return;
                }
            case 5:
                i iVar = (i) obj;
                String str7 = iVar.f1744a;
                int i11 = 1;
                if (str7 == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str7);
                }
                kVar.b(2, c1.F(iVar.f1745b));
                String str8 = iVar.f1746c;
                if (str8 == null) {
                    kVar.I(3);
                } else {
                    kVar.j(3, str8);
                }
                String str9 = iVar.f1747d;
                if (str9 == null) {
                    kVar.I(4);
                } else {
                    kVar.j(4, str9);
                }
                byte[] bArrC2 = t2.f.c(iVar.e);
                if (bArrC2 == null) {
                    kVar.I(5);
                } else {
                    kVar.w(5, bArrC2);
                }
                byte[] bArrC3 = t2.f.c(iVar.f1748f);
                if (bArrC3 == null) {
                    kVar.I(6);
                } else {
                    kVar.w(6, bArrC3);
                }
                kVar.b(7, iVar.f1749g);
                kVar.b(8, iVar.h);
                kVar.b(9, iVar.i);
                kVar.b(10, iVar.f1751k);
                int i12 = iVar.f1752l;
                int iD = u.e.d(i12);
                if (iD == 0) {
                    i = 0;
                } else {
                    if (iD != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i12 != 1 ? i12 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i = 1;
                }
                kVar.b(11, i);
                kVar.b(12, iVar.f1753m);
                kVar.b(13, iVar.f1754n);
                kVar.b(14, iVar.f1755o);
                kVar.b(15, iVar.f1756p);
                kVar.b(16, iVar.f1757q ? 1L : 0L);
                int i13 = iVar.f1758r;
                int iD2 = u.e.d(i13);
                if (iD2 == 0) {
                    i10 = 0;
                } else {
                    if (iD2 != 1) {
                        StringBuilder sb3 = new StringBuilder("Could not convert ");
                        sb3.append(i13 != 1 ? i13 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb3.append(" to int");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i10 = 1;
                }
                kVar.b(17, i10);
                t2.c cVar2 = iVar.f1750j;
                if (cVar2 == null) {
                    kVar.I(18);
                    kVar.I(19);
                    kVar.I(20);
                    kVar.I(21);
                    kVar.I(22);
                    kVar.I(23);
                    kVar.I(24);
                    kVar.I(25);
                    return;
                }
                int i14 = cVar2.f8532a;
                int iD3 = u.e.d(i14);
                if (iD3 == 0) {
                    i11 = 0;
                } else if (iD3 != 1) {
                    if (iD3 == 2) {
                        i11 = 2;
                    } else if (iD3 == 3) {
                        i11 = 3;
                    } else if (iD3 == 4) {
                        i11 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i14 != 6) {
                            throw new IllegalArgumentException("Could not convert " + da.v.w(i14) + " to int");
                        }
                        i11 = 5;
                    }
                }
                kVar.b(18, i11);
                kVar.b(19, cVar2.f8533b ? 1L : 0L);
                kVar.b(20, cVar2.f8534c ? 1L : 0L);
                kVar.b(21, cVar2.f8535d ? 1L : 0L);
                kVar.b(22, cVar2.e ? 1L : 0L);
                kVar.b(23, cVar2.f8536f);
                kVar.b(24, cVar2.f8537g);
                t2.e eVar = cVar2.h;
                HashSet hashSet = eVar.f8540a;
                HashSet<t2.d> hashSet2 = eVar.f8540a;
                byte[] byteArray = null;
                ObjectOutputStream objectOutputStream = null;
                byteArray = null;
                if (hashSet.size() != 0) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream2.writeInt(hashSet2.size());
                                        for (t2.d dVar2 : hashSet2) {
                                            objectOutputStream2.writeUTF(dVar2.f8538a.toString());
                                            objectOutputStream2.writeBoolean(dVar2.f8539b);
                                        }
                                        objectOutputStream2.close();
                                    } catch (IOException e) {
                                        e = e;
                                        objectOutputStream = objectOutputStream2;
                                        e.printStackTrace();
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        byteArrayOutputStream.close();
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        if (byteArray == null) {
                                            byteArrayOutputStream = 25;
                                            kVar.I(25);
                                        } else {
                                            byteArrayOutputStream = 25;
                                            kVar.w(25, byteArray);
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r10 = objectOutputStream2;
                                        r11 = byteArrayOutputStream;
                                        if (r10 != 0) {
                                            try {
                                                r10.close();
                                            } catch (IOException e4) {
                                                e4.printStackTrace();
                                            }
                                        }
                                        try {
                                            r11.close();
                                            throw th;
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                            throw th;
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r11 = byteArrayOutputStream;
                                r10 = byteArray;
                            }
                        } catch (IOException e12) {
                            e = e12;
                        }
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    break;
                }
                if (byteArray == null) {
                    byteArrayOutputStream = 25;
                    kVar.I(25);
                } else {
                    byteArrayOutputStream = 25;
                    kVar.w(25, byteArray);
                }
                return;
            default:
                k kVar2 = (k) obj;
                String str10 = kVar2.f1765a;
                if (str10 == null) {
                    kVar.I(1);
                } else {
                    kVar.j(1, str10);
                }
                String str11 = kVar2.f1766b;
                if (str11 == null) {
                    kVar.I(2);
                    return;
                } else {
                    kVar.j(2, str11);
                    return;
                }
        }
    }

    public final void m(Object obj) {
        i2.k kVarA = a();
        try {
            l(kVarA, obj);
            kVarA.f5157b.executeInsert();
        } finally {
            g(kVarA);
        }
    }
}

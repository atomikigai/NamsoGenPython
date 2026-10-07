package o1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import g.c;
import h6.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f7456f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f7457g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7459b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f7460c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7461d = new ArrayList();
    public final c e;

    public b(Context context) {
        this.f7458a = context;
        this.e = new c(this, context.getMainLooper());
    }

    public static b a(Context context) {
        b bVar;
        synchronized (f7456f) {
            try {
                if (f7457g == null) {
                    f7457g = new b(context.getApplicationContext());
                }
                bVar = f7457g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final boolean b(Intent intent) {
        String str;
        synchronized (this.f7459b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7458a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f7460c.get(intent.getAction());
                if (arrayList != null) {
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i = 0;
                    while (i < arrayList.size()) {
                        a aVar = (a) arrayList.get(i);
                        if (z4) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + aVar.f7452a);
                        }
                        if (aVar.f7454c) {
                            if (z4) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = aVar.f7452a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z4) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(aVar);
                                aVar.f7454c = true;
                            } else {
                                arrayList = arrayList;
                                if (z4) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = "data";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            ((a) arrayList2.get(i10)).f7454c = false;
                        }
                        this.f7461d.add(new o0(16, intent, arrayList2));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

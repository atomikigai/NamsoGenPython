package com.google.firebase.messaging;

import a2.l;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import da.x;
import e7.i;
import ga.a;
import gb.g;
import gb.q;
import hb.b;
import i5.e;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l5.p;
import n9.j;
import za.c;
import za.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayDeque f2737f = new ArrayDeque(10);

    /* JADX WARN: Code duplicated, block: B:147:0x0269  */
    /* JADX WARN: Code duplicated, block: B:153:0x0282  */
    /* JADX WARN: Code duplicated, block: B:155:0x028b  */
    /* JADX WARN: Code duplicated, block: B:156:0x028d  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    @Override // gb.g
    public final void b(Intent intent) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z4;
        long j4;
        n9.g gVarD;
        j jVar;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                d(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        int i = 10;
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = f2737f;
            if (arrayDeque.contains(stringExtra)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra);
                    return;
                }
                return;
            }
            if (arrayDeque.size() >= 10) {
                arrayDeque.remove();
            }
            arrayDeque.add(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("message_type");
        if (stringExtra2 == null) {
            stringExtra2 = "gcm";
        }
        int iIntValue = 0;
        switch (stringExtra2) {
            case "deleted_messages":
                return;
            case "gcm":
                if (r7.g.B(intent)) {
                    r7.g.u("_nr", intent.getExtras());
                }
                if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                    z4 = false;
                } else {
                    try {
                        n9.g.d();
                        n9.g gVarD2 = n9.g.d();
                        gVarD2.a();
                        Context context = gVarD2.f7359a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z4 = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                    z4 = false;
                                } else {
                                    z4 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                                break;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    } catch (IllegalStateException unused2) {
                        Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                    }
                }
                if (z4) {
                    e eVar = FirebaseMessaging.f2727n;
                    if (eVar == null) {
                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        Object obj = extras.get("google.ttl");
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else if (obj instanceof String) {
                            try {
                                iIntValue = Integer.parseInt((String) obj);
                            } catch (NumberFormatException unused3) {
                                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            }
                        }
                        int i10 = iIntValue;
                        String string = extras.getString("google.to");
                        if (TextUtils.isEmpty(string)) {
                            try {
                                n9.g gVarD3 = n9.g.d();
                                Object obj2 = c.f11536m;
                                string = (String) Tasks.await(((c) gVarD3.b(d.class)).c());
                            } catch (InterruptedException | ExecutionException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        String str4 = string;
                        n9.g gVarD4 = n9.g.d();
                        gVarD4.a();
                        String packageName = gVarD4.f7359a.getPackageName();
                        b bVar = i.A(extras) ? b.DISPLAY_NOTIFICATION : b.DATA_MESSAGE;
                        String string2 = extras.getString("google.message_id");
                        if (string2 == null) {
                            string2 = extras.getString("message_id");
                        }
                        String str5 = string2 != null ? string2 : "";
                        String string3 = extras.getString("from");
                        if (string3 == null || !string3.startsWith("/topics/")) {
                            string3 = null;
                        }
                        String str6 = string3 != null ? string3 : "";
                        String string4 = extras.getString("collapse_key");
                        String str7 = string4 != null ? string4 : "";
                        String string5 = extras.getString("google.c.a.m_l");
                        String str8 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.c_l");
                        String str9 = string6 != null ? string6 : "";
                        if (!extras.containsKey("google.c.sender.id")) {
                            gVarD = n9.g.d();
                            jVar = gVarD.f7361c;
                            gVarD.a();
                            str = jVar.e;
                            if (str != null) {
                                gVarD.a();
                                str2 = jVar.f7367b;
                                if (str2.startsWith("1:")) {
                                    j4 = Long.parseLong(str2);
                                } else {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j4 = Long.parseLong(str3);
                                        } else {
                                            j4 = 0;
                                        }
                                    } else {
                                        j4 = 0;
                                    }
                                }
                            } else {
                                j4 = Long.parseLong(str);
                            }
                        } else {
                            try {
                                j4 = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e4) {
                                Log.w("FirebaseMessaging", "error parsing project number", e4);
                                gVarD = n9.g.d();
                                jVar = gVarD.f7361c;
                                gVarD.a();
                                str = jVar.e;
                                if (str != null) {
                                    gVarD.a();
                                    str2 = jVar.f7367b;
                                    if (str2.startsWith("1:")) {
                                        strArrSplit = str2.split(":");
                                        if (strArrSplit.length < 2) {
                                            str3 = strArrSplit[1];
                                            if (str3.isEmpty()) {
                                                j4 = Long.parseLong(str3);
                                            } else {
                                                j4 = 0;
                                            }
                                        } else {
                                            j4 = 0;
                                        }
                                    } else {
                                        j4 = Long.parseLong(str2);
                                    }
                                } else {
                                    try {
                                        j4 = Long.parseLong(str);
                                    } catch (NumberFormatException e10) {
                                        Log.w("FirebaseMessaging", "error parsing sender ID", e10);
                                        gVarD.a();
                                        str2 = jVar.f7367b;
                                        if (str2.startsWith("1:")) {
                                            try {
                                                j4 = Long.parseLong(str2);
                                            } catch (NumberFormatException e11) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e11);
                                                j4 = 0;
                                            }
                                        } else {
                                            strArrSplit = str2.split(":");
                                            if (strArrSplit.length < 2) {
                                                j4 = 0;
                                            } else {
                                                str3 = strArrSplit[1];
                                                if (str3.isEmpty()) {
                                                    j4 = 0;
                                                } else {
                                                    try {
                                                        j4 = Long.parseLong(str3);
                                                    } catch (NumberFormatException e12) {
                                                        Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                                        j4 = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            ((p) eVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.b("proto"), new a(i)).i(new i5.a(new hb.e(new hb.d(j4 > 0 ? j4 : 0L, str5, str4, bVar, packageName, str7, i10, str6, str8, str9)), i5.c.f5209a), new a(28));
                        } catch (RuntimeException e13) {
                            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e13);
                        }
                    }
                    break;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    extras2 = new Bundle();
                }
                extras2.remove("androidx.content.wakelockid");
                if (i.A(extras2)) {
                    i iVar = new i(extras2);
                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new x("Firebase-Messaging-Network-Io", 3));
                    try {
                        if (new l(this, iVar, executorServiceNewSingleThreadExecutor).A()) {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            return;
                        } else {
                            executorServiceNewSingleThreadExecutor.shutdown();
                            if (r7.g.B(intent)) {
                                r7.g.u("_nf", intent.getExtras());
                            }
                        }
                    } catch (Throwable th) {
                        executorServiceNewSingleThreadExecutor.shutdown();
                        throw th;
                    }
                }
                c(new q(extras2));
                return;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra3 = intent.getStringExtra("error");
                new f7.j(stringExtra3);
                if (stringExtra3 == null) {
                    return;
                }
                stringExtra3.toLowerCase(Locale.US).getClass();
                return;
            case "send_event":
                intent.getStringExtra("google.message_id");
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra2));
                return;
        }
    }

    public void c(q qVar) {
    }

    public void d(String str) {
    }
}

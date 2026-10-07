package f7;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3628b;

    public /* synthetic */ g(h hVar, int i) {
        this.f3627a = i;
        this.f3628b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3627a) {
            case 0:
                this.f3628b.a("Service disconnected");
                return;
            case 1:
                h hVar = this.f3628b;
                while (true) {
                    synchronized (hVar) {
                        try {
                            if (hVar.f3629a != 2) {
                                return;
                            }
                            if (hVar.f3632d.isEmpty()) {
                                hVar.c();
                                return;
                            }
                            i iVar = (i) hVar.f3632d.poll();
                            hVar.e.put(iVar.f3634a, iVar);
                            ((ScheduledExecutorService) hVar.f3633f.f3640c).schedule(new a3.e(hVar, iVar, 10, false), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String strValueOf = String.valueOf(iVar);
                                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
                                sb2.append("Sending ");
                                sb2.append(strValueOf);
                                Log.d("MessengerIpcClient", sb2.toString());
                            }
                            Context context = (Context) hVar.f3633f.f3639b;
                            Messenger messenger = hVar.f3630b;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = iVar.f3636c;
                            messageObtain.arg1 = iVar.f3634a;
                            messageObtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", iVar.a());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", iVar.f3637d);
                            messageObtain.setData(bundle);
                            try {
                                aa.c cVar = hVar.f3631c;
                                Messenger messenger2 = (Messenger) cVar.f263b;
                                if (messenger2 != null) {
                                    messenger2.send(messageObtain);
                                } else {
                                    e eVar = (e) cVar.f264c;
                                    if (eVar == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                    }
                                    Messenger messenger3 = eVar.f3622a;
                                    messenger3.getClass();
                                    messenger3.send(messageObtain);
                                }
                            } catch (RemoteException e) {
                                hVar.a(e.getMessage());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                break;
            default:
                h hVar2 = this.f3628b;
                synchronized (hVar2) {
                    if (hVar2.f3629a == 1) {
                        hVar2.a("Timed out while binding");
                    }
                    break;
                }
                return;
        }
    }
}

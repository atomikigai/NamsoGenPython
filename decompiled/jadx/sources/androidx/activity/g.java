package androidx.activity;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f356d;

    public /* synthetic */ g(Object obj, int i, Object obj2, int i10) {
        this.f353a = i10;
        this.f355c = obj;
        this.f354b = i;
        this.f356d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f353a) {
            case 0:
                h hVar = (h) this.f355c;
                Serializable serializable = (Serializable) ((a4.b) this.f356d).f113b;
                String str = (String) hVar.f396a.get(Integer.valueOf(this.f354b));
                if (str != null) {
                    androidx.activity.result.e eVar = (androidx.activity.result.e) hVar.e.get(str);
                    if (eVar == null) {
                        hVar.f401g.remove(str);
                        hVar.f400f.put(str, serializable);
                    } else {
                        androidx.activity.result.b bVar = eVar.f392a;
                        if (hVar.f399d.remove(str)) {
                            bVar.e(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((h) this.f355c).a(this.f354b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f356d));
                break;
            case 2:
                ((SystemForegroundService) this.f355c).e.notify(this.f354b, (Notification) this.f356d);
                break;
            case 3:
                ((BottomSheetBehavior) this.f355c).E((View) this.f356d, false, this.f354b);
                break;
            case 4:
                ((TextView) this.f356d).setTypeface((Typeface) this.f355c, this.f354b);
                break;
            case 5:
                ((o.g) this.f355c).f7427b.onNavigationEvent(this.f354b, (Bundle) this.f356d);
                break;
            default:
                ((w2.g) this.f356d).a((Intent) this.f355c, this.f354b);
                break;
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i, int i10) {
        this.f353a = i10;
        this.f356d = obj;
        this.f355c = obj2;
        this.f354b = i;
    }

    public g(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f353a = 3;
        this.f355c = bottomSheetBehavior;
        this.f356d = view;
        this.f354b = i;
    }
}

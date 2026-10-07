package q0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f7885c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7887b;

    public c() {
        this(f7885c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f7886a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a4.b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f7886a, view);
        if (accessibilityNodeProviderA != null) {
            return new a4.b(accessibilityNodeProviderA, 27);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f7886a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, r0.l lVar) {
        this.f7886a.onInitializeAccessibilityNodeInfo(view, lVar.f8119a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f7886a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f7886a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean zB;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i10 = 0;
        while (true) {
            if (i10 < list.size()) {
                r0.f fVar = (r0.f) list.get(i10);
                if (fVar.a() == i) {
                    Class cls = fVar.f8115c;
                    r0.x xVar = fVar.f8116d;
                    if (xVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zB = xVar.c(view);
                        break;
                    }
                } else {
                    i10++;
                }
            }
            zB = false;
            break;
        }
        if (!zB) {
            zB = b.b(this.f7886a, view, i, bundle);
        }
        if (zB || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zB;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
            }
        }
        return z4;
    }

    public void h(View view, int i) {
        this.f7886a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f7886a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7886a = accessibilityDelegate;
        this.f7887b = new a(this);
    }
}

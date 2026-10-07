package g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.namso_gen.spacehowen.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final c E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f3995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f3996d;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f3997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f3998g;
    public Button i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f3999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Message f4000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f4001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f4002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Message f4003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f4004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f4005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f4006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollView f4007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f4008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f4009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f4010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f4011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f4012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ListAdapter f4013x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4015z;
    public boolean h = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4014y = -1;
    public final com.google.android.material.datepicker.l F = new com.google.android.material.datepicker.l(this, 1);

    public e(Context context, f fVar, Window window) {
        this.f3993a = context;
        this.f3994b = fVar;
        this.f3995c = window;
        c cVar = new c();
        cVar.f3988b = new WeakReference(fVar);
        this.E = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, R.attr.alertDialogStyle, 0);
        this.f4015z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.D = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        fVar.c().l(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.E.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f4005p = charSequence;
            this.f4006q = messageObtainMessage;
        } else if (i == -2) {
            this.f4002m = charSequence;
            this.f4003n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f3999j = charSequence;
            this.f4000k = messageObtainMessage;
        }
    }
}

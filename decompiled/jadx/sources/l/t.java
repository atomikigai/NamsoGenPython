package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class t extends EditText implements q0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.n f6420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f6421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f6422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0.t f6423d;
    public final z e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f6424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        z2.a(context);
        y2.a(getContext(), this);
        fd.n nVar = new fd.n(this);
        this.f6420a = nVar;
        nVar.l(attributeSet, R.attr.editTextStyle);
        w0 w0Var = new w0(this);
        this.f6421b = w0Var;
        w0Var.f(attributeSet, R.attr.editTextStyle);
        w0Var.b();
        z zVar = new z();
        zVar.f6498b = this;
        this.f6422c = zVar;
        this.f6423d = new u0.t();
        z zVar2 = new z(this);
        this.e = zVar2;
        zVar2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = zVar2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private s getSuperCaller() {
        if (this.f6424f == null) {
            this.f6424f = new s(this);
        }
        return this.f6424f;
    }

    @Override // q0.v
    public final q0.i a(q0.i iVar) {
        return this.f6423d.a(this, iVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            nVar.a();
        }
        w0 w0Var = this.f6421b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return jd.d.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6421b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6421b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f6422c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) zVar.f6499c;
        return textClassifier == null ? q0.a((TextView) zVar.f6498b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] strArrF;
        InputConnection dVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6421b.getClass();
        w0.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        n9.b.u(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrF = q0.v0.f(this)) != null) {
            t0.b.b(editorInfo, strArrF);
            a5.a aVar = new a5.a(this, 29);
            if (i >= 25) {
                dVar = new t0.c(inputConnectionOnCreateInputConnection, aVar);
            } else if (t0.b.a(editorInfo).length != 0) {
                dVar = new t0.d(inputConnectionOnCreateInputConnection, aVar);
            }
            inputConnectionOnCreateInputConnection = dVar;
        }
        return this.e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && q0.v0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = c0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        q0.g gVar;
        q0.f fVar;
        int i10;
        q0.e eVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || q0.v0.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i11 >= 31) {
                eVar = new q0.e(primaryClip, 1);
            } else {
                gVar = new q0.g();
                gVar.f7898b = primaryClip;
                gVar.f7899c = 1;
            }
            if (i == 16908322) {
                fVar = gVar;
                fVar = eVar;
                i10 = 0;
            } else {
                fVar = gVar;
                fVar = eVar;
                i10 = 1;
            }
            fVar.c(i10);
            q0.v0.h(this, fVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6421b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f6421b;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(jd.d.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.e.d(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6420a;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f6421b;
        w0Var.l(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f6421b;
        w0Var.m(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w0 w0Var = this.f6421b;
        if (w0Var != null) {
            w0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f6422c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            zVar.f6499c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
